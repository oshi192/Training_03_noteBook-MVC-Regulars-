package model;

import model.entity.Address;
import model.entity.Contacts;
import model.entity.Names;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Model {
    private Entity tmpEntity;

    List<Entity> noteBook = new ArrayList();

    public void createNewEntity() {
        tmpEntity = new Entity();
    }

    public Entity getTmpEntity() {
        return tmpEntity;
    }

    public void saveEntity() {
        if(tmpEntity.getCreateAt()== null){
            tmpEntity.setCreateAt(new Date());
        }
        tmpEntity.setUpdateAt(new Date());
        noteBook.add(tmpEntity);
    }

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
                    "\nnickName\t" + nickName  +
                    "\ncomment\t\t" + comment  +
                    "\ncreateAt\t" + createAt +
                    "\nupdateAt\t" + updateAt +
                    "}\n";
        }
    }

}
