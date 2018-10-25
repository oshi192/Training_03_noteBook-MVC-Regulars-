package model;


import model.entity.Entity;
import model.exceptions.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Model {
    private Entity tmpEntity;

    private List<Entity> noteBook = new ArrayList();

    public void createNewEntity() {
        tmpEntity = new Entity();
    }

    public Entity getTmpEntity() {
        return tmpEntity;
    }

    public void saveEntity() throws NotUniqueLoginException {
        if(!isUniqueLogin(tmpEntity.getNickName())){
            throw new NotUniqueLoginException(tmpEntity.getNickName());
        }
        if (tmpEntity.getCreateAt() == null) {
            tmpEntity.setCreateAt(new Date());
        }
        tmpEntity.setUpdateAt(new Date());
        noteBook.add(tmpEntity);
    }

    public List<Entity> getNoteBook() {
        return noteBook;
    }

    boolean isUniqueLogin(String nickname) {

        boolean result = true;
//        for (Entity e : noteBook) {
//            if(e.getNickName().equals(nickname)) {
//                result = false;
//            }
//        }
        if ( noteBook.stream()
                .filter(x -> x.getNickName().equals(nickname))
                .findFirst()
                .orElse(null)  != null){
            result = false;
        }
        return result;
    }


}
