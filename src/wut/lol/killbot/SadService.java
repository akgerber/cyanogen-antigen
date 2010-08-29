package wut.lol.killbot;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SadService extends Service {
	
	
	private NotificationManager mNM;
	private static final int NOTIFICATION = 5;

	@Override
	public void onCreate() {
	    mNM = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
	    
	    int icon = android.R.drawable.star_big_on;
	    long when = System.currentTimeMillis();
	    Notification foregroundSvcNotify = new Notification(icon, "aww shit", when);
	    startForeground(NOTIFICATION, foregroundSvcNotify);
	    
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
