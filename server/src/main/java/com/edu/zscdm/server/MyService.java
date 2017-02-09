package com.edu.zscdm.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    private IBinder iBinder = new IMyAidlInterface.Stub() {
        @Override
        public int add(int a, int b) throws RemoteException {
            return a + b;
        }
    };

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }
}
