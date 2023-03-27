package hu.bme.mit.inf.symod.homework.generic.tests;

import org.junit.Test;

public class TestCases {
	public static void main(String[] args) {
		TestCases testCases = new TestCases();
		try{ testCases.base1(); }catch(AssertionError e) {}try{ testCases.base2(); }catch(AssertionError e) {}try{ testCases.optionCycle(); }catch(AssertionError e) {}try{ testCases.checkSetStartTimeForWhite(); }catch(AssertionError e) {}try{ testCases.checkSetBonusTimeForWhite(); }catch(AssertionError e) {}try{ testCases.checkSetStartTimeForBlack(); }catch(AssertionError e) {}try{ testCases.checkSetBonusTimeForBlack(); }catch(AssertionError e) {}try{ testCases.checkSetStartPlayer(); }catch(AssertionError e) {}try{ testCases.checkEffectSetStartTimeForWhite(); }catch(AssertionError e) {}try{ testCases.checkEffectSetBonusTimeForWhite(); }catch(AssertionError e) {}try{ testCases.checkEffectSetStartTimeForBlack(); }catch(AssertionError e) {}try{ testCases.checkEffectSetBonusTimeForBlack(); }catch(AssertionError e) {}try{ testCases.checkEffectSetStartPlayer(); }catch(AssertionError e) {}try{ testCases.checkResetInOptions(); }catch(AssertionError e) {}try{ testCases.checkStartInGame(); }catch(AssertionError e) {}
	}
	
	@Test(timeout=10000)
	public void base1() {
		TesterAPI c = new TesterAPI("base1","Basic test: Pressing each button.");
	c.pushBlack();
	c.pushWhite();
	c.pushMod();
	c.pushStart();
	System.out.println("base1 Succeeded!");
	}
	
	@Test(timeout=10000)
	public void base2() {
		TesterAPI c = new TesterAPI("base2","Basic test: Waiting for 3 sec.");
	c.clockForward(3000);
	System.out.println("base2 Succeeded!");
	}
	
	@Test(timeout=10000)
	public void optionCycle() {
		TesterAPI c = new TesterAPI("optionCycle","By pushing the MOD button in the menu each options are available, and are set to the default values.");
	c.expectText("Ready to play");
	c.pushMod();
	c.expectBeep(false);
	c.expectText("White initial time");
	c.expectWhiteNumber(60);
	c.pushMod();
	c.expectBeep(false);
	c.expectText("White increment time");
	c.expectWhiteNumber(30);
	c.pushMod();
	c.expectBeep(false);
	c.expectText("Black initial time");
	c.expectBlackNumber(60);
	c.pushMod();
	c.expectBeep(false);
	c.expectText("Black increment time");
	c.expectBlackNumber(30);
	c.pushMod();
	c.expectBeep(false);
	c.expectText("White begins");
	c.pushMod();
	c.expectBeep(false);
	c.expectText("Ready to play");
	System.out.println("optionCycle Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkSetStartTimeForWhite() {
		TesterAPI c = new TesterAPI("checkSetStartTimeForWhite","Checking the upper and lower bounds of the target option for the White player. First, the value is increased from default to maximal, plus one more time to check if it stops. Then, it decreased to minimal and checked again it it stops.");
	c.pushMod();
	c.expectWhiteNumber(60);
	c.pushWhite();
	c.expectWhiteNumber(90);
	c.pushWhite();
	c.expectWhiteNumber(120);
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.expectWhiteNumber(540);
	c.pushWhite();
	c.expectWhiteNumber(570);
	c.pushWhite();
	c.expectWhiteNumber(600);
	c.pushWhite();
	c.expectBeep(false);
	c.expectWhiteNumber(600);
	c.pushBlack();
	c.expectWhiteNumber(570);
	c.pushBlack();
	c.expectWhiteNumber(540);
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.expectWhiteNumber(90);
	c.pushBlack();
	c.expectWhiteNumber(60);
	c.pushBlack();
	c.expectWhiteNumber(30);
	c.pushBlack();
	c.expectWhiteNumber(30);
	c.expectBeep(false);
	System.out.println("checkSetStartTimeForWhite Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkSetBonusTimeForWhite() {
		TesterAPI c = new TesterAPI("checkSetBonusTimeForWhite","Checking the upper and lower bounds of the target option for the White player. First, the value is increased from default to maximal, plus one more time to check if it stops. Then, it decreased to minimal and checked again it it stops.");
	c.pushMod();
	c.pushMod();
	c.expectWhiteNumber(30);
	c.pushWhite();
	c.expectBeep(false);
	c.expectWhiteNumber(30);
	c.pushBlack();
	c.expectWhiteNumber(29);
	c.pushBlack();
	c.expectWhiteNumber(28);
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.expectWhiteNumber(2);
	c.pushBlack();
	c.expectWhiteNumber(1);
	c.pushBlack();
	c.expectWhiteNumber(0);
	c.pushBlack();
	c.expectWhiteNumber(0);
	c.expectBeep(false);
	System.out.println("checkSetBonusTimeForWhite Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkSetStartTimeForBlack() {
		TesterAPI c = new TesterAPI("checkSetStartTimeForBlack","Checking the upper and lower bounds of the target optionfor the Black player. First, the value is increased from default to maximal, plus one more time to check if it stops. Then, it decreased to minimal and checked again it it stops.");
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectBlackNumber(60);
	c.pushWhite();
	c.expectBlackNumber(90);
	c.pushWhite();
	c.expectBlackNumber(120);
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.pushWhite();
	c.expectBlackNumber(540);
	c.pushWhite();
	c.expectBlackNumber(570);
	c.pushWhite();
	c.expectBlackNumber(600);
	c.pushWhite();
	c.expectBeep(false);
	c.expectBlackNumber(600);
	c.pushBlack();
	c.expectBlackNumber(570);
	c.pushBlack();
	c.expectBlackNumber(540);
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.expectBlackNumber(90);
	c.pushBlack();
	c.expectBlackNumber(60);
	c.pushBlack();
	c.expectBlackNumber(30);
	c.pushBlack();
	c.expectBlackNumber(30);
	c.expectBeep(false);
	System.out.println("checkSetStartTimeForBlack Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkSetBonusTimeForBlack() {
		TesterAPI c = new TesterAPI("checkSetBonusTimeForBlack","Checking the upper and lower bounds of the target optionfor the Black player. First, the value is increased from default to maximal, plus one more time to check if it stops. Then, it decreased to minimal and checked again it it stops.");
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectBlackNumber(30);
	c.pushWhite();
	c.expectBeep(false);
	c.expectBlackNumber(30);
	c.pushBlack();
	c.expectBlackNumber(29);
	c.pushBlack();
	c.expectBlackNumber(28);
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.pushBlack();
	c.expectBlackNumber(2);
	c.pushBlack();
	c.expectBlackNumber(1);
	c.pushBlack();
	c.expectBlackNumber(0);
	c.pushBlack();
	c.expectBlackNumber(0);
	c.expectBeep(false);
	System.out.println("checkSetBonusTimeForBlack Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkSetStartPlayer() {
		TesterAPI c = new TesterAPI("checkSetStartPlayer","Checking whether the initial player can be set.");
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectText("White begins");
	c.pushBlack();
	c.expectText("Black begins");
	c.pushBlack();
	c.expectText("Black begins");
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectText("Black begins");
	c.pushWhite();
	c.expectText("White begins");
	c.pushWhite();
	c.expectText("White begins");
	System.out.println("checkSetStartPlayer Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkEffectSetStartTimeForWhite() {
		TesterAPI c = new TesterAPI("checkEffectSetStartTimeForWhite","Checks the result of changeing the initial time for player Whtie.");
	c.pushMod();
	c.expectText("White initial time");
	c.expectWhiteNumber(60);
	c.pushWhite();
	c.expectText("White initial time");
	c.expectWhiteNumber(90);
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectText("Ready to play");
	c.pushStart();
	c.expectText("White moves");
	c.expectWhiteNumber(90);
	c.clockForward(3000);
	c.expectWhiteNumber(87);
	System.out.println("checkEffectSetStartTimeForWhite Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkEffectSetBonusTimeForWhite() {
		TesterAPI c = new TesterAPI("checkEffectSetBonusTimeForWhite","Checks the result of changeing the initial time for player Whtie.");
	c.pushMod();
	c.pushMod();
	c.expectText("White increment time");
	c.expectWhiteNumber(30);
	c.pushBlack();
	c.expectText("White increment time");
	c.expectWhiteNumber(29);
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectText("Ready to play");
	c.pushStart();
	c.expectText("White moves");
	c.expectWhiteNumber(60);
	c.pushWhite();
	c.expectBeep(true);
	c.expectWhiteNumber(89);
	System.out.println("checkEffectSetBonusTimeForWhite Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkEffectSetStartTimeForBlack() {
		TesterAPI c = new TesterAPI("checkEffectSetStartTimeForBlack","Checks the result of changeing the initial time for player Black.");
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectText("Black initial time");
	c.expectBlackNumber(60);
	c.pushWhite();
	c.expectText("Black initial time");
	c.expectBlackNumber(90);
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectText("Ready to play");
	c.pushStart();
	c.pushWhite();
	c.expectBeep(true);
	c.expectText("Black moves");
	c.expectBlackNumber(90);
	c.clockForward(3000);
	c.expectBlackNumber(87);
	System.out.println("checkEffectSetStartTimeForBlack Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkEffectSetBonusTimeForBlack() {
		TesterAPI c = new TesterAPI("checkEffectSetBonusTimeForBlack","Checks the result of changeing the initial time for player Black.");
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.expectText("Black increment time");
	c.expectBlackNumber(30);
	c.pushBlack();
	c.expectText("Black increment time");
	c.expectBlackNumber(29);
	c.pushMod();
	c.pushMod();
	c.expectText("Ready to play");
	c.pushStart();
	c.pushWhite();
	c.expectBeep(true);
	c.expectText("Black moves");
	c.expectBlackNumber(60);
	c.pushBlack();
	c.expectBeep(true);
	c.expectBlackNumber(89);
	System.out.println("checkEffectSetBonusTimeForBlack Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkEffectSetStartPlayer() {
		TesterAPI c = new TesterAPI("checkEffectSetStartPlayer","Checks the result of changing the initial player.");
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushMod();
	c.pushBlack();
	c.pushMod();
	c.expectText("Ready to play");
	c.pushStart();
	c.expectText("Black moves");
	System.out.println("checkEffectSetStartPlayer Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkResetInOptions() {
		TesterAPI c = new TesterAPI("checkResetInOptions","Checking the effect of pushing the START/RESET button in the options.");
	c.pushMod();
	c.expectText("White initial time");
	c.expectWhiteNumber(60);
	c.pushWhite();
	c.expectText("White initial time");
	c.expectWhiteNumber(90);
	c.pushStart();
	c.expectText("Ready to play");
	System.out.println("checkResetInOptions Succeeded!");
	}
	
	@Test(timeout=10000)
	public void checkStartInGame() {
		TesterAPI c = new TesterAPI("checkStartInGame","Checking the START/RESET button in the game");
	c.expectText("Ready to play");
	c.expectText("Ready to play");
	c.pushStart();
	c.expectText("White moves");
	c.pushStart();
	c.expectText("Ready to play");
	System.out.println("checkStartInGame Succeeded!");
	}
	
}
