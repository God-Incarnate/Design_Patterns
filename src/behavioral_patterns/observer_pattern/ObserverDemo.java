package behavioral_patterns.observer_pattern;

/*
1️⃣ What is the Observer Pattern?

The Observer Pattern is a Behavioral Design Pattern that defines a one-to-many dependency between objects.

This means:

When one object (Subject) changes its state, all dependent objects (Observers) are automatically notified and updated.

In simple terms:

Subject → Notifies → Multiple Observers

This is also known as the Publish–Subscribe (Pub/Sub) pattern.

2️⃣ Real-Life Analogy
📺 YouTube Channel Subscription

When you subscribe to a channel:

YouTube Channel → Subscribers

If the channel uploads a new video:

All subscribers receive notification

Structure:

Channel (Subject)
     |
Subscribers (Observers)

Subscribers automatically get notified when the channel updates.

3️⃣ Why Do We Need Observer Pattern?

Imagine a weather station system.

Many displays depend on the weather data:

Temperature Display
Mobile App
TV Weather Channel
Statistics Dashboard

Without observer pattern:

WeatherStation → manually update each display

This creates tight coupling.

With Observer pattern:

WeatherStation → notifyObservers()

Observers automatically update themselves.

4️⃣ Structure of Observer Pattern

Basic structure:

Subject → Observers

Detailed structure:

         Subject
           |
     ----------------
     |              |
 Observer1      Observer2
     |              |
ConcreteObserver ConcreteObserver
5️⃣ Components of Observer Pattern
Component	Role
Subject	Maintains list of observers
Observer	Interface for receiving updates
ConcreteSubject	Actual object that changes
ConcreteObserver	Objects that react to updates
 */
public class ObserverDemo {
    static void main(String[] args){
        NewsAgencies agencies=new NewsAgencies();
        NewsChannel cnn=new NewsChannel("CNN");
        NewsChannel bbc=new NewsChannel("BBC");
        agencies.addObserver(cnn);
        agencies.addObserver(bbc);
        agencies.setNewsAndSend("New AI breakthrough!");
    }
}
/*
1️⃣1️⃣ Execution Flow

Step 1 – Create subject

NewsAgency

Step 2 – Register observers

CNN
BBC

Step 3 – Change state

agency.setNews("New AI breakthrough!")

Step 4 – Notify observers

notifyObservers()

Step 5 – Observers update

Output:

CNN received news: New AI breakthrough!
BBC received news: New AI breakthrough!
1️⃣2️⃣ Visual Flow
NewsAgency (Subject)
       |
-------------------------
|                       |
CNN                 BBC
(Observer)         (Observer)

When news changes:

Subject → notifyObservers() → observers.update()
 */
