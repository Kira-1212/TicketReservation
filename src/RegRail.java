/*
TicketReservation

Description
============
This code is a college project based on Java
to showcase the concepts learnt on Inheritance,
AWT, Event Handling, String classes and File
Handling.

Working
========
We take user's details using a GUI and save it
in a file.The data inputted through the text fields
is put into files by using file output stream and
write method. Byte array method was used to convert
string into byte. The booking system gui was made
using awt concepts by extending frame and implementing
Action Listener. Different layouts were used and for
the purpose of taking input from the user text fields
were used and labels were accompanied to give idea
about textfield.

Authors:
Sai Kiran Davuluri <saikiran.davuluri@gmail.com>

*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
class RegRail extends Frame implements ActionListener
{

  Panel p1,p2,p3,p4,p5; // 5 panels for adding other fields
  Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11; //Labels for naming
  FlowLayout fl=new FlowLayout(); //Overall UI
  Button b1,b2; //Confirm and Close buttons
  String str1,str2,str3,str4,str5,str6,str7,str8,str9,str10,str11; //Data vars
  TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11; //Input fields

  //Overall GUI design happens here
  RegRail()
  {
    p5=new Panel();	p3=new Panel();
    p4=new Panel();
    p1=new Panel();
    p2=new Panel();
    l=new Label(" Railway Booking");
    l1=new Label("Name");
    l2=new Label("D.O.B");
    l3=new Label("Address");
    l4=new Label("Email");
    l5=new Label("Phone No");
    l6=new Label("pincode");
    l7=new Label("Date of Journey");
    l8=new Label("pick Up");
    l9=new Label("Destination");
    l10=new Label("Train");
    l11=new Label("No:of Seats");
    tf1=new TextField(30);
    tf2=new TextField(30);
    tf3=new TextField(30);
    tf4=new TextField(30);
    tf5=new TextField(30);
    tf6=new TextField(30);
    tf7=new TextField(30);
    tf8=new TextField(30);
    tf9=new TextField(30);
    tf10=new TextField(30);
    tf11=new TextField(30);

    p1.setLayout(new GridLayout(6,2));
    p2.setLayout(new GridLayout(5,2));
    p1.add(l1);p1.add(tf1);
    p1.add(l2);p1.add(tf2);
    p1.add(l3);p1.add(tf3);
    p1.add(l4);p1.add(tf4);
    p1.add(l5);p1.add(tf5);
    p1.add(l6);p1.add(tf6);
    p2.add(l7);p2.add(tf7);
    p2.add(l8);p2.add(tf8);
    p2.add(l9);p2.add(tf9);
    p2.add(l10);p2.add(tf10);
    p2.add(l11);p2.add(tf11);
    b1=new Button("Confirm");
    b2=new Button("Close");
    b1.addActionListener(this);
    b2.addActionListener(this);
    p5.setLayout(fl);
    p5.add(p1);
    p5.add(p2);
    p3.add(l);
    p4.add(b1);
    p4.add(b2);
    setLayout(new BorderLayout());
    add(p5,"Center");
    //add(p1,"West");
    //add(p2,"East");
    add(p3,"North");
    add(p4,"South");
    setVisible(true);
    setSize(600,300);
  }

  public void textValueChanged(TextEvent ae)
  {
  }

  //Event Listener
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
      str1=l1.getText()+":"+tf1.getText()+"\r\n";
      str2=l2.getText()+":"+tf2.getText()+"\r\n";
      str3=l3.getText()+":"+tf3.getText()+"\r\n";
      str4=l4.getText()+":"+tf4.getText()+"\r\n";
      str5=l5.getText()+":"+tf5.getText()+"\r\n";
      str6=l6.getText()+":"+tf6.getText()+"\r\n";
      str7=l7.getText()+":"+tf7.getText()+"\r\n";
      str8=l8.getText()+":"+tf8.getText()+"\r\n";
      str9=l9.getText()+":"+tf9.getText()+"\r\n";
      str10=l10.getText()+":"+tf10.getText()+"\r\n";
      str11=l11.getText()+":"+tf11.getText()+"\r\n";
      byte bb1[]=str1.getBytes();
      byte bb2[]=str2.getBytes();
      byte bb3[]=str3.getBytes();
      byte bb4[]=str4.getBytes();
      byte bb5[]=str5.getBytes();
      byte bb6[]=str6.getBytes();
      byte bb7[]=str7.getBytes();
      byte bb8[]=str8.getBytes();
      byte bb9[]=str9.getBytes();
      byte bb10[]=str10.getBytes();
      byte bb11[]=str11.getBytes();
      try{

        FileOutputStream f= new FileOutputStream(tf1.getText()+".txt");
        f.write(bb1);
        f.write(bb2);
        f.write(bb3);
        f.write(bb4);
        f.write(bb5);
        f.write(bb6);
        f.write(bb7);
        f.write(bb8);
        f.write(bb9);
        f.write(bb10);
        f.write(bb11);
        //f.write(str1.charAt(i));
      }
      catch(Exception e)
      {
        System.out.println(e.getMessage());
      }
    }
    if(ae.getSource()==b2)
    {
      System.exit(0);
    }
  }

  //Main Function
  public static void main(String args[])
  {
    //Initialise the GUI
    RegRail rr=new RegRail();
  }
}
