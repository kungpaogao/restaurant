import SwiftUI
//import shared

struct ContentView: View {
    //    let greet = Greeting().greet()
    
    var body: some View {
        NavigationView() {
            TabView {
                Home()
                    .tabItem {
                        Label("Home", systemImage: "fork.knife")
                    }
                Gallery()
                    .tabItem {
                        Label("Gallery", systemImage: "photo.on.rectangle.angled")
                    }
                Profile()
                    .tabItem {
                        Label("Profile", systemImage: "person.crop.circle")
                    }
            }
        }
    }
}


