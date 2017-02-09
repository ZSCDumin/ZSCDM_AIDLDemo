package com.edu.zscdm.aidltest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class RemoteService extends Service {
    private IBinder iBinder = new IRemoteService.Stub() {
        Person person = new Person();
        @Override
        public String getName() throws RemoteException {
            return person.getName();
        }

        @Override
        public Person getPerson() throws RemoteException {
            return person;
        }

        @Override
        public void setName() throws RemoteException {
            person.setName("Dumin");
        }
    };

    public RemoteService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }
}
