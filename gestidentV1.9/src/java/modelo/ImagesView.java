/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author stand
 */
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ImagesView {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        images.add("1.jpg");
        images.add("2.jpg");
        images.add("3.jpg");/*
        for (int i = 1; i <= 3; i++) {
            images.add(i + ".jpg");
        }*/
    }
    public List<String> getImages() {
        return images;
    }
}