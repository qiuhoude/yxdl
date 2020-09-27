/*    */ package com.wanniu.game.request.five2five;
/*    */ 
/*    */ import com.wanniu.core.game.entity.GClientEvent;
/*    */ import com.wanniu.core.game.protocol.PomeloResponse;
/*    */ import com.wanniu.core.util.StringUtil;
/*    */ import com.wanniu.game.player.WNPlayer;
/*    */ import com.wanniu.game.request.solo.SoloRequestFilter;
/*    */ import java.io.IOException;
/*    */ import pomelo.five2five.Five2FiveHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @GClientEvent("five2five.five2FiveHandler.five2FiveLeaveAreaRequest")
/*    */ public class LeaveAreaHandler
/*    */   extends SoloRequestFilter
/*    */ {
/*    */   public PomeloResponse request(final WNPlayer player) throws Exception {
/* 22 */     return new PomeloResponse()
/*    */       {
/*    */         protected void write() throws IOException {
/* 25 */           Five2FiveHandler.Five2FiveLeaveAreaResponse.Builder res = Five2FiveHandler.Five2FiveLeaveAreaResponse.newBuilder();
/* 26 */           String msg = player.five2FiveManager.leaveFive2FiveArea();
/* 27 */           if (!StringUtil.isEmpty(msg)) {
/* 28 */             res.setS2CCode(500);
/* 29 */             res.setS2CMsg(msg);
/* 30 */             this.body.writeBytes(res.build().toByteArray());
/*    */           } else {
/* 32 */             res.setS2CCode(200);
/* 33 */             this.body.writeBytes(res.build().toByteArray());
/*    */           } 
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              D:\Yxdl\xmds-server\mmoarpg-game.jar!\com\wanniu\game\request\five2five\LeaveAreaHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */