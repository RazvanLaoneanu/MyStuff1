package SDAcademy.mobile.shop.entity;

import javax.persistence.*;

@Entity
@Table(name="phone")
public class Phone{

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id_phone")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="brandname")
    private String brandname;

    @Column(name="img")
    private String img;

    @Column(name="camera")
    private String camera;

    @Column(name="ram")
    private Integer ram;

    @Column(name="screensize")
    private Integer screensize;

    @Column(name = "internalmemory")
    private Integer internalmemory;

    @Column(name = "stock")
    private Integer stock;

    public Phone(){

    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getScreensize() {
        return screensize;
    }

    public void setScreensize(Integer screensize) {
        this.screensize = screensize;
    }

    public Integer getInternalmemory() {
        return internalmemory;
    }

    public void setInternalmemory(Integer internalmemory) {
        this.internalmemory = internalmemory;
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", name='" + name + '\'' + ", brandname='" + brandname + '\'' + ", img='" + img + '\'' + ", camera='" + camera + '\'' + ", ram=" + ram + ", screensize=" + screensize + ", internalmemory=" + internalmemory + '}';
    }
}


