// IRemoteService.aidl
package com.edu.zscdm.aidltest;
import com.edu.zscdm.aidltest.Person;

interface IRemoteService {
    String getName();
    Person getPerson();
    void setName();
}
