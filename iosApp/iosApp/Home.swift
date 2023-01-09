//
//  Home.swift
//  iosApp
//
//  Created by Andrew Gao on 1/8/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct Home: View {
    var body: some View {
        List() {
            ForEach(0..<10) { i in
                CardView(index: i)
            }
        }
        .listRowSeparator(.hidden)
        .listStyle(.plain)
        .navigationTitle("Cards")
        .toolbar() {}
    }
}

struct CardView: View {
    var index: Int
    
    var body: some View {
        HStack {
            VStack(alignment: .leading) {
                Text("Gramercy Tavern")
                    .font(.title2)
                Text("January 8, 2023")
                    .font(.subheadline)
            }
            Spacer()
            Text(index.description)
        }
        .padding()
        .cornerRadius(10)
        .background(
            RoundedRectangle(cornerRadius: 10, style: .continuous)
                .foregroundColor(Color(hue: 1.0, saturation: 0.0, brightness: 0.246))
        )
    }
}
