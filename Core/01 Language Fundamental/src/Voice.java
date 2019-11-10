package com.company.module.submodule;

import com.sun.speech.freetts.VoiceManager;

public class Voice {
private String name;
private com.sun.speech.freetts.Voice voice;
public Voice(String name) {
	this.name=name;
	this.voice=VoiceManager.getInstance().getVoice(this.name);
	this.voice.allocate();
}
public void say(String something) {
	this.voice.speak(something);
}
public static void main(String[] args) {
	Voice new1=new Voice("kevin16");
	String sayMe="Magnanimous!";
	new1.say(sayMe);
}
}
