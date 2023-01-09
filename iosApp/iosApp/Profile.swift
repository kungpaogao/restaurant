//
//  ProfileView.swift
//  iosApp
//
//  Created by Andrew Gao on 1/8/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct Profile: View {
    var body: some View {
        VStack(alignment: .leading) {
            Rectangle()
                .ignoresSafeArea(edges: .top)
                .foregroundColor(.blue)
                .frame(height: 100)
            
            VStack {
                Circle()
                    .stroke(.gray, lineWidth: 4)
                    .shadow(radius: 7)
                    .frame(height: 100)
                    .foregroundColor(.gray)
                    .offset(y: -50)
                    .padding(.bottom, -50)
                
                Text("Andrew G")
                    .font(.title)
                    .padding(.bottom, 16)
                
                Text("Statistics")
                    .font(.title)
                Spacer()
            }.padding()
        }
    }
}
