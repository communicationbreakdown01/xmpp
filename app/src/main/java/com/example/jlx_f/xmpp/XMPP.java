package com.example.jlx_f.xmpp;

import android.os.AsyncTask;

import org.jivesoftware.smack.tcp.XMPPTCPConnection;


/**
 * Created by JLx_F on 28.11.2016.
 */
public class XMPP {

    private String rPiServerAdress;
    private XMPPTCPConnection connection;
    private String patientID;

    public XMPP(String rPiServerAdress, String patientID ){
        this.rPiServerAdress=rPiServerAdress;
        this.patientID=patientID;
    }

    public void connect(){
        AsyncTask<Void, Void, Boolean> connectionThread = new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... params) {
                return true;
            }
        };
        connectionThread.execute();
    }


}
