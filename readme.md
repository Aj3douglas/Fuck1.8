**Fuck 1.8**
-

Hey guys, Whats poppin logangsters, 

I have created a resource that is available for anyone to use, it is a high quality plugin that lets
you know if you have "accidentally" fucked up, and put a 1.8 jar in your plugins folder. As we all know, no one should use 1.8,
which is why I created this resource. I feel this resource could be helpful to some of those who still havent 
gotten the hint, *frcsty*, that 1.8 is bad, and you shouldnt use it. 

**Future plans**
-
 - Auto download 1.16 jar and replace the shitty one with it
 - Expand the API
 
 **Using the API**
 -
 The api for fuck 1.8, is quite advanced, so keep in mind you know what you are doing when using it
 To add it to your build tool, use this,
 
 ```groovy
    repositories{
		maven { url 'https://jitpack.io' }
    } 

	dependencies {
	    implementation 'com.github.Aj3douglas:Fuck1.8:master-SNAPSHOT'
	}
```

**Listening to events**

The API for Fuck 1.8 has quite an extensive API, but to listen to events you do it as per usual, here is an example

```java
public class FuckYou implements Listener{
  @EventHandler
  public void onFuck(FuckEvent event){
    System.out.println("Fuck me, I mustve accidentally put 1.8 as the server version, im a fucking idiot");
  }
}
```

