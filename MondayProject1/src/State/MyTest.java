package State;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyTest {

	@Test
	void TestAddArrayList() {
		 
		ArrayList<String> al = new ArrayList<>();
		StateScript st = new StateScript(al);
		
		st.AddStates("Tenesse");
		st.AddStates("Florida");
		st.AddStates("Maine");
		st.AddStates("Ohio");
		
		al.add("Tenesse");
		al.add("Florida");
		al.add("Maine");
		al.add("Ohio");
		
		assertTrue(al.equals(st.getStates()));
		
	}
	
	@Test
	void TestAddArrayList2() {
		 
		ArrayList<String> al = new ArrayList<>();
		StateScript st = new StateScript(al);
		
		st.AddStates("NewYork");
		st.AddStates("newJersEy");
		st.AddStates("California");
		st.AddStates("Seaatle");
		
		al.add("NewYork");
		al.add("newJersEy");
		al.add("California");
		al.add("Seaatle");
		
		assertTrue(al.equals(st.getStates()));
		
	}
	@Test
	void TestAddArrayList3() {
		 
		ArrayList<String> al = new ArrayList<>();
		StateScript st = new StateScript(al);
		
		st.AddStates(null);
		
		al.add(null);
		
		assertTrue(al.equals(st.getStates()));
		
	}
	
	
	@Test
	void TestSetStates1() {
		 
		
		
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Idaho");
		stArray.add("Kansas");
		stArray.add("Maryland");
		stArray.add("Mississippi");
		stArray.add("Wyoming");
		stArray.add("Washington");
		
		StateScript st = new StateScript(stArray);
		
		ArrayList<String> actual = st.SetStates("New York");
		
		ArrayList<String> expectedSta = new ArrayList<>();
		expectedSta.add("New York");
		expectedSta.add("Kansas");
		expectedSta.add("New York");
		expectedSta.add("Mississippi");
		expectedSta.add("New York");
		expectedSta.add("Washington");
		
		
		assertTrue(actual.equals(expectedSta));
		
		  
	}

	
	@Test
	void TestSetStates2() {
		 
		
		
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("Missouri");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		
		StateScript st = new StateScript(stArray);
		
		ArrayList<String> actual = st.SetStates("Illinois");
		
		ArrayList<String> expectedSta = new ArrayList<>();
		expectedSta.add("Illinois");
		expectedSta.add("North Dakota");
		expectedSta.add("Illinois");
		expectedSta.add("Minnesota");
		expectedSta.add("Illinois");
		expectedSta.add("Arkansas");
		
		
		assertTrue(actual.equals(expectedSta));
		
		  
	}
	
	
	@Test
	void TestCountofState1() {
		  
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("Missouri");
		stArray.add("Oregon");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		stArray.add("Oregon");
		stArray.add("Oregon");
		
		StateScript st = new StateScript(stArray);
	
		int actual = st.countOfState("Oregon");
		
		int expected = 4;
		
		assertTrue(actual==expected);
		
	}
	
	
	@Test
	void TestCountofState2() {
		  
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("Missouri");
		stArray.add("Oregon");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		stArray.add("Oregon");
		stArray.add("Oregon");
		
		StateScript st = new StateScript(stArray);
	
		int actual = st.countOfState("New Yrk");
		
		int expected = 0;
		
		assertTrue(actual==expected);
		
	}
	
	
	
	@Test
	void TestCountofState3() {
		  
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("Missouri");
		stArray.add("Oregon");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		stArray.add("Oregon");
		stArray.add("Oregon");
		
		StateScript st = new StateScript(stArray);
	
		int actual = st.countOfState("Alabama");
		
		int expected = 1;
		
		assertTrue(actual==expected);
		
	}
	
	@Test
	void TestRemoveStates1() {
		 
		
		
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("Missouri");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		stArray.add("Missouri");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		
		StateScript st = new StateScript(stArray);
		
		ArrayList<String> actual = st.RemoveTheState("Minnesota");
		
		ArrayList<String> expectedSta = new ArrayList<>();
		expectedSta.add("Oregon");
		expectedSta.add("North Dakota");
		expectedSta.add("Missouri");
		expectedSta.add("Alabama");
		expectedSta.add("Arkansas");
		expectedSta.add("Missouri"); 
		expectedSta.add("Alabama");
		expectedSta.add("Arkansas");
		
		assertTrue(actual.equals(expectedSta));
		
		  
	}
	
	@Test
	void TestRemoveStates2() {
		 
		
		
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("Missouri");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		stArray.add("Missouri");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		
		StateScript st = new StateScript(stArray);
		
		ArrayList<String> actual = st.RemoveTheState("Arkansas");
		
		ArrayList<String> expectedSta = new ArrayList<>();
		expectedSta.add("Oregon");
		expectedSta.add("North Dakota");
		expectedSta.add("Missouri");
		expectedSta.add("Minnesota");
		expectedSta.add("Alabama");
		expectedSta.add("Missouri");
		expectedSta.add("Minnesota");
		expectedSta.add("Alabama");
		
		assertTrue(actual.equals(expectedSta));
		
		  
	}
	
	
	@Test
	void TestRemoveStates3() {
		 
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("Missouri");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		stArray.add("Missouri");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		
		StateScript st = new StateScript(stArray);
		
		ArrayList<String> actual = st.RemoveTheState("Missouri");
		
		ArrayList<String> expectedSta = new ArrayList<>();
		expectedSta.add("Oregon");
		expectedSta.add("North Dakota");
		expectedSta.add("Minnesota");
		expectedSta.add("Alabama");
		expectedSta.add("Arkansas");
		expectedSta.add("Minnesota");
		expectedSta.add("Alabama");
		expectedSta.add("Arkansas");
		
		assertTrue(actual.equals(expectedSta));
		 
	}
	
	
	@Test
	void TestRemoveDuplicate1() {
		 
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("New Jersey");
		stArray.add("Missouri");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("Arkansas");
		stArray.add("Missouri");
		stArray.add("Maine");
		stArray.add("Minnesota");
		stArray.add("Alabama");
		stArray.add("ThisisnotState");
		stArray.add("Arkansas");
		
		StateScript st = new StateScript(stArray);
		
		ArrayList<String> actual = st.RemoveDuplicatedStates();
		
		ArrayList<String> expectedSta = new ArrayList<>();
		expectedSta.add("Oregon");
		expectedSta.add("North Dakota");
		expectedSta.add("New Jersey");
		expectedSta.add("Minnesota");
		expectedSta.add("Maine");
		expectedSta.add("ThisisnotState"); 
		
		assertTrue(actual.equals(expectedSta));
		 
	}
	
	@Test
	void TestRemoveDuplicate2() {
		 
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("New Jersey");
		stArray.add("California");
		stArray.add("Washington");
		stArray.add("Wisconsin");
		stArray.add("Missisipi");
		stArray.add("Illinois");
		stArray.add("Florida");
		
		StateScript st = new StateScript(stArray);
		
		ArrayList<String> actual = st.RemoveDuplicatedStates();
		
		ArrayList<String> expectedSta = new ArrayList<>();
		
		expectedSta.add("Oregon");
		expectedSta.add("North Dakota");
		expectedSta.add("New Jersey");
		expectedSta.add("California");
		expectedSta.add("Washington");
		expectedSta.add("Wisconsin");
		expectedSta.add("Missisipi");
		expectedSta.add("Illinois");
		expectedSta.add("Florida");
		
		assertTrue(actual.equals(expectedSta));
	}
	
	@Test
	void TestReplaceState1() {
		 
		ArrayList<String> stArray = new ArrayList<>();
		stArray.add("Oregon");
		stArray.add("North Dakota");
		stArray.add("New Jersey");
		stArray.add("California");
		stArray.add("Washington");
		stArray.add("Wisconsin");
		stArray.add("Missisipi");
		stArray.add("Washington");
		stArray.add("Illinois");
		stArray.add("Florida");
		stArray.add("Washington");
		
		StateScript st = new StateScript(stArray);
		
		ArrayList<String> actual = st.replaceStateWithOtherState("Washington", "Texas");
		
		ArrayList<String> expectedSta = new ArrayList<>();
		
		expectedSta.add("Oregon");
		expectedSta.add("North Dakota");
		expectedSta.add("New Jersey");
		expectedSta.add("California");
		expectedSta.add("Washington");
		expectedSta.add("Wisconsin");
		expectedSta.add("Missisipi");
		expectedSta.add("Washington");
		expectedSta.add("Illinois");
		expectedSta.add("Florida");
		expectedSta.add("Washington");
		
		assertTrue(actual.equals(expectedSta));
	}
}
