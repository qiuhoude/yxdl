package com.wanniu.game.request.equip;

import com.alibaba.fastjson.JSON;
import com.wanniu.core.db.GCache;
import com.wanniu.core.game.LangService;
import com.wanniu.core.game.entity.GClientEvent;
import com.wanniu.core.game.protocol.PomeloRequest;
import com.wanniu.core.game.protocol.PomeloResponse;
import com.wanniu.core.util.StringUtil;
import com.wanniu.game.common.ConstsTR;
import com.wanniu.game.item.ItemUtil;
import com.wanniu.game.item.NormalItem;
import com.wanniu.game.item.po.PlayerItemPO;
import com.wanniu.game.player.WNPlayer;

import java.io.IOException;

import pomelo.area.EquipHandler;
import pomelo.item.ItemOuterClass;


@GClientEvent("area.equipHandler.chatEquipDetailRequest")
public class ChatEquipDetailHandler
        extends PomeloRequest {
    public PomeloResponse request() throws Exception {
        final WNPlayer player = (WNPlayer) this.pak.getPlayer();

        EquipHandler.ChatEquipDetailRequest req = EquipHandler.ChatEquipDetailRequest.parseFrom(this.pak.getRemaingBytes());
        final String itemId = req.getC2SId();

        return new PomeloResponse() {
            protected void write() throws IOException {
                EquipHandler.ChatEquipDetailResponse.Builder res = EquipHandler.ChatEquipDetailResponse.newBuilder();
                String showItem = GCache.get(ConstsTR.chat_item_tr.value + "/" + itemId);
                if (StringUtil.isNotEmpty(showItem)) {
                    NormalItem item = ItemUtil.createItemByDbOpts((PlayerItemPO) JSON.parseObject(showItem, PlayerItemPO.class));
                    ItemOuterClass.ItemDetail.Builder itemDetail = item.getItemDetail(player.playerBasePO);
                    res.setS2CCode(200);
                    res.setS2CData(itemDetail);
                } else {
                    res.setS2CCode(500);
                    res.setS2CMsg(LangService.getValue("LINK_HAS_FAILED"));
                }
                this.body.writeBytes(res.build().toByteArray());
            }
        };
    }
}


