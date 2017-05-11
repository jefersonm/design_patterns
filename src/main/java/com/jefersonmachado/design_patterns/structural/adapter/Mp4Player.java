package com.jefersonmachado.design_patterns.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void play(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }

}
