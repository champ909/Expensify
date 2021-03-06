package com.expensetracker.Model;

import android.support.annotation.NonNull;
import android.text.format.DateUtils;

import java.util.Comparator;
import java.util.Date;

/**
 * Created by user on 03-07-2017.
 */

public class ExpenseModel  {

    int id;
    int amount;
    String date;
    String category;
    int groupid;
    String groupname;
    String description;
    UserModel usermodel;
    GroupModel groupModel;

    public ExpenseModel(int id, int amount, String date, String category, int groupid, String description,String groupname) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.groupid = groupid;
        this.groupname = groupname;
        this.description = description;
    }

    public ExpenseModel(int id, int amount, String date, String category, int groupid, String description) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.groupid = groupid;
        this.description = description;
    }

    public ExpenseModel(int id,int groupid,int amount, String date, String category, String description,String groupname, UserModel usermodel) {
       this.groupname = groupname;
        this.groupid = groupid;
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
        this.usermodel = usermodel;
    }

    public ExpenseModel(int id, int amount, String date,  String description,String category, UserModel usermodel, GroupModel groupModel) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
        this.usermodel = usermodel;
        this.groupModel = groupModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserModel getUsermodel() {
        return usermodel;
    }

    public void setUsermodel(UserModel usermodel) {
        this.usermodel = usermodel;
    }

    public GroupModel getGroupModel() {
        return groupModel;
    }

    public void setGroupModel(GroupModel groupModel) {
        this.groupModel = groupModel;
    }


}



