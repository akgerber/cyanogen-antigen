package wut.lol.killbot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class killhome extends Activity {
    /** Called when the activity is first created. */

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button sadButton = (Button)findViewById(R.id.sadButton);
        sadButton.setOnClickListener(lol);
    }
    
    
    private Button.OnClickListener lol = new Button.OnClickListener(){
	    public void onClick(View v) {
	    	Toast.makeText(killhome.this, "lol", Toast.LENGTH_LONG);
	    	Intent intent = new Intent(killhome.this, SadService.class);
	    	killhome.this.startService(intent);
	    }
    };
}