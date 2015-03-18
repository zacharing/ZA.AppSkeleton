package edu.saintjoe.cs.brianc.appskeleton;

import com.google.devtools.simple.runtime.components.Component;
import com.google.devtools.simple.runtime.components.HandlesEventDispatching;
import com.google.devtools.simple.runtime.components.android.Button;
import com.google.devtools.simple.runtime.components.android.Form;
import com.google.devtools.simple.runtime.components.android.Label;
import com.google.devtools.simple.runtime.components.android.HorizontalArrangement;

import com.google.devtools.simple.runtime.events.EventDispatcher;


public class SkeletonActivity extends Form implements HandlesEventDispatching {

	
	// We begin with constants, and "global settings" variables
	
	
	// Next are the UI widget references
	
	// These objects are equivalent to "components" of App Inventor
	// The containers which organize the app screen
	private HorizontalArrangement line1;
	private HorizontalArrangement line2;

	private Button dumbButton;
	private Label resultLabel;

 // Java Bridger apps all use $define() in place of main()
 void $define() {
 	
 	// Code in this block is equivalent to the "Designer" part of App Inventor
    
	 // "this" is an Activity object, or the "main screen"
     this.BackgroundColor(COLOR_WHITE);
     
     // Create containers for UI widgets
     line1 = new HorizontalArrangement(this);
     line2 = new HorizontalArrangement(this);
     
     dumbButton = new Button(line1,"Empujeme");
     
     resultLabel = new Label(line2,"");
     
     
     // Let the runtime system know which events to report to the dispatcher
     EventDispatcher.registerEventForDelegation(this, "ButtonClick", "Click");
    
 } // end $define()

 // This method, known as a "callback" is invoked by the runtime system
 // It will only be called when a delegated event occurs
 @Override
 public boolean dispatchEvent(Component component, String id, String eventName,
         Object[] args) {
 	
 	// This code is equivalent to the "Blocks" part of App Inventor
	    if (component.equals(dumbButton) && eventName.equals("Click")){
	    	resultLabel.Text("Empujado!!");
	         return true;
	     } // end dispatch '+' press
	
	// This line is syntactically required
    return true;
	} // end handleOperation

} // end class
