package teamcerberus.cerberuscore.test;

import teamcerberus.cerberuscore.events.PlayerLoginEvent;
import teamcerberus.cerberuscore.events.PlayerLogoutEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class EventTest {
	@ForgeSubscribe
	public void onLogin(PlayerLoginEvent evt) {
		System.out.println(evt.entityPlayer.username + " Just logged in!");
	}
	
	@ForgeSubscribe
	public void onLogout(PlayerLogoutEvent evt) {
		System.out.println(evt.entityPlayer.username + " Just logged out!");
	}
	
	@ForgeSubscribe
	public void onChangeDimension(PlayerLoginEvent evt) {
		System.out.println(evt.entityPlayer.username + " Just changed dimensions!");
	}
	
	@ForgeSubscribe
	public void onRespawn(PlayerLoginEvent evt) {
		System.out.println(evt.entityPlayer.username + " Just respawned!");
	}
}
