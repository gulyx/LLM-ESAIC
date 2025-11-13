package it.cnr.iasi.saks.llmEsaic.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import it.cnr.iasi.saks.llmEsaic.impl.DummyESAICPrompter;

public class DummyTests {

    @Test
    public void upAndRunningTest() {
    	DummyESAICPrompter prompter = new DummyESAICPrompter();
    	String answer = prompter.oneShotInteraction();
    	assertNotNull(answer);
    }

    @Test
    public void simpleConversationWithoutMemoryTest() {
    	DummyESAICPrompter prompter = new DummyESAICPrompter();
    	
    	String prompt = "My name is Guybrush Threepwood. If it is clear just reply: \"OK\"";		
    	String answer = prompter.queryLLM(prompt);    		
    	assertTrue(answer.contains("OK"));

    	prompt = "What's my name?";		
    	answer = prompter.queryLLM(prompt);
    	assertFalse(answer.contains("Guybrush Threepwood"));
    }

    @Test
    public void simpleConversationTest() {
    	DummyESAICPrompter prompter = new DummyESAICPrompter();
    	
    	String prompt = "My name is Guybrush Threepwood. If it is clear just reply: \"OK\"";		
    	String answer = prompter.chatLLM(prompt);    		
    	assertTrue(answer.contains("OK"));

    	prompt = "What's my name?";		
    	answer = prompter.chatLLM(prompt);
    	assertTrue(answer.contains("Guybrush Threepwood"));
    }

}
