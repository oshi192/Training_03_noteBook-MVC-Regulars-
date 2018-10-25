package model.entity;

import model.Group;

import java.util.Date;

public class Entity {
    Group group;
    Names names;
    Address address;
    Contacts contacts;
    private String nickName;
    private String comment;
    private Date createAt;
    private Date updateAt;

    public void setNames(Names names) {
        this.names = names;
    }

    public void setAdress(Address adress) {
        this.address = adress;

    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    @Override
    public String toString() {
        return "Entity{\n" +
                "group\t\t" + group +
                "\nnames\t\t" + names +
                "\nadress\t\t" + address +
                "\ncontacts\t" + contacts +
                "\nnickName\t" + nickName +
                "\ncomment\t\t" + comment +
                "\ncreateAt\t" + createAt +
                "\nupdateAt\t" + updateAt +
                "}\n";
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (this == obj) {
            result = true;
        } else if (obj == null) {
            result = false;
        } else if (getClass() == obj.getClass()) {
            Entity tmp = (Entity) obj;
            result = this.group.equals(tmp.group) &&
                    this.names.equals(tmp.names) &&
                    this.address.equals(tmp.address) &&
                    this.contacts.equals(tmp.contacts) &&
                    this.nickName.equals(tmp.nickName) &&
                    this.comment.equals(tmp.comment) &&
                    this.createAt.equals(tmp.createAt) &&
                    this.updateAt.equals(tmp.updateAt);
        } else {
            result = false;
        }
        return result;
    }
}