package users;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Orderf {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String email2;
    private String nameOrder;
    private String textOrder;
    private String priseOrder;
    private Boolean programingTag;
    private Boolean videoTag;
    private Boolean photoTag;
    private Boolean disigneTag;
    private Boolean gameTag;
    //private String date;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email2) {
        this.email2 = email2;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

   public void setPhotoTag(Boolean photoTag) {
        this.photoTag = photoTag;
    }

    public void setPriseOrder(String priseOrder) {
        this.priseOrder = priseOrder;
    }

   public void setDisigneTag(Boolean disigneTag) {
        this.disigneTag = disigneTag;
    }


    public void setGameTag(Boolean gameTag) {
        this.gameTag = gameTag;
    }

    public void setProgramingTag(Boolean programingTag) {
        this.programingTag = programingTag;
    }

    public void setTextOrder(String textOrder) {
        this.textOrder = textOrder;
    }

    public void setVideoTag(Boolean videoTag) {
        this.videoTag = videoTag;
    }

    public Integer getId() {
        return id;
    }


    public Boolean getProgramingTag() {
        return programingTag;
    }

    public Boolean getDisigneTag() {
        return disigneTag;
    }

    public Boolean getPhotoTag() {
        return photoTag;
    }

    public Boolean getVideoTag() {
        return videoTag;
    }

    public String getEmail2() {
        return email2;
    }

    public Boolean getGameTag() {
        return gameTag;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public String getPriseOrder() {
        return priseOrder;
    }

    public String getTextOrder() {
        return textOrder;
    }
    public Orderf(){

    }
    public Orderf(String email2, String nameOrder, String textOrder, String priseOrder, Boolean programingTag, Boolean videoTag, Boolean photoTag, Boolean disigneTag, Boolean gameTag){
        this.email2 = email2;
        this.nameOrder = nameOrder;
        this.textOrder = textOrder;
        this.priseOrder = priseOrder;
        this.programingTag = programingTag;
        this.videoTag = videoTag;
        this.photoTag = photoTag;
        this.disigneTag = disigneTag;
        this.gameTag = gameTag;

    }


}
