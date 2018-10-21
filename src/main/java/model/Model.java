package model;

import model.entity.Adress;
import model.entity.Contacts;
import model.entity.Names;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Model {
    List<Entity> entity = new ArrayList();

    public void createNewEntity() {
        entity.add(new Entity());
    }

    public Entity getLastEntity() {
        return entity.get(entity.size()-1);
    }

    public class Entity {
        Names names;
        Adress adress;
        Contacts contacts;
        private String nickName;
        private String comment;
        private Date createAt;
        private Date updateAt;


        private Entity (){

        }

        public void setNames(Names names) {
            this.names = names;
        }

        public void setAdress(Adress adress) {
            this.adress = adress;
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
    }
}
