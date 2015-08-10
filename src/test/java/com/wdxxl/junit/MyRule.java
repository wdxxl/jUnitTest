package com.wdxxl.junit;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

class MyRule implements MethodRule{  
	MyRule(){
		
	}  
      
    @Override  
    public Statement apply(final Statement base, final FrameworkMethod method, Object target) {  
      return new Statement() {  
         @Override  
         public void evaluate() throws Throwable {  
        	 	System.out.println("before evaluate..");
                base.evaluate();  
                System.out.println("after evaluate..");
			}
      };  
    }  
}  