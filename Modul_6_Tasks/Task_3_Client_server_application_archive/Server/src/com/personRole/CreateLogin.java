package com.personRole;


import com.readerAndWriter.XMLjdomWriter;

import java.io.IOException;

public class CreateLogin {

    public CreateLogin(String newLogin,String newPassword) throws IOException {

        PersonRole.logins.add(new Login(newLogin,newPassword,"guest"));

        XMLjdomWriter write = new XMLjdomWriter();
    }
}
