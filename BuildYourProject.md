# Build Your Project
For this project, you will be thinking deeply about the structure of an app and laying out that structure in Android.

## Project Goals
You won't need to implement the actual music playing functionality. You just need to describe it. The goal of this project is to plan for building an app that has the structure of a music playing app to practice app design and the use of explicit intents to navigate around the app.

Each Activity should contain a TextView that describes the Activity. If you decide to mock up the content, or add real content, the reviewer might comment on your work, but it will not be considered to meet the requirements.

## Getting Started
First, take a look at different kinds of music player apps. If you're having trouble, check out the Play Music app, the Pandora Radio app, and the Spotify app to start with.

Think about what kind of music player you would like to build. Will you make a streaming app? One that plays music from the device's library? Will you make a music discovery app?

## Design Planning
Once you've chosen, write out a couple of ways you could structure your app. Think about where a user will start and what the most common use case of the app will be.

Select a potential structure and create an app with that structure in Android Studio. Your app should have 3 to 6 Activities. Some ideas for Activities would be:

- "Now playing" screen
- List artists, albums, playlists, or podcasts
- Detail screen or screens for individual artists, albums, or podcasts
- Store screen for buying music online
- Search screen

Each Activity should contain a TextView which tells a user the point of the screen. You should also add a collection of buttons indicating what Activities can be reached from the current one. Use OnClickListener objects to make your buttons change Activity using Intents. Each activity should have a TextView that displays the purpose of the activity, as well as buttons that will let you navigate to other activities.

For example, a "Now Playing" Activity should have a TextView that describes the screen. It can also contain buttons that move to the Song Detail or Artist Detail Activities.

Finally, do some research on the technical hurdles and add a potential solution to each screen. The solution could be Android libraries or classes, an API on the internet, or code you could plan on writing. You do not need to actually implement any functionality.

### The required components for this project are:
- App should have 3 to 6 Activities
- Each Activity contains a TextView explaining the Activity and the buttons that allow the user to change Activity
- One of those Activities is a Payment Activity. For this Activity, find an external library or API that can be used in this situation. In the TextView of this activity, describe the library or API and how it can be used.

_Many students ask, why is the Payment Activity required?_ When creating an app, developers commonly rely on existing external libraries or APIs so they don't have to re-write and maintain functionality that already exists. Processing payments or logins are common examples. As the creator of the Music app, your focus is on creating a smooth music playing experience, so leveraging existing code whose focus is on payments allows you to focus on developing your Music Player rather than developing Payment processing functionality.

Your project will be evaluated using the Musical Structure project rubric.