import SwiftUI

@main
struct iOSApp: App {
	var body: some Scene {
		WindowGroup {
			ContentView()
                .environment(\.colorScheme, .dark)
		}
	}
}
