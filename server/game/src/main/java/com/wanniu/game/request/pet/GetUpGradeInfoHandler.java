package com.wanniu.game.request.pet;

import com.wanniu.core.game.entity.GClientEvent;
import com.wanniu.core.game.protocol.PomeloRequest;
import com.wanniu.core.game.protocol.PomeloResponse;


@GClientEvent("area.petHandler.upGradeInfoRequest")
public class GetUpGradeInfoHandler
        extends PomeloRequest {
    public PomeloResponse request() throws Exception {
        return null;
    }
}


