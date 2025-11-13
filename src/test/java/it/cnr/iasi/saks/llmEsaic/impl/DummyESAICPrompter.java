package it.cnr.iasi.saks.llmEsaic.impl;

import it.cnr.iasi.saks.llmEsaic.AbstractESAICPrompter;

public class DummyESAICPrompter extends AbstractESAICPrompter {

	public DummyESAICPrompter () {
	}
	
	public String oneShotInteraction() {
		String prompt = "In very few words, who is Guybrush Threepwood?";
		
		String answer = this.queryLLM(prompt);
		
		return answer;
	}
}
