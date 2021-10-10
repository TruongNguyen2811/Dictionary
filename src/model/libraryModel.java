package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author afkda
 */
public class libraryModel {

    private int id;
    private String word;
    private String mean;
    private String pronunciation;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
    public String getPronunciation(){
        return pronunciation;
                
    }
    public void setPronunciation(String pronunciation){
        this.pronunciation = pronunciation;
    }

    public libraryModel() {
    }

    public libraryModel(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }


}
