//
//  Gallery.swift
//  iosApp
//
//  Created by Andrew Gao on 1/8/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

// see: https://codewithchris.com/photo-gallery-app-swiftui-part-2/

struct Gallery: View {
    var body: some View {
        
        let columns = [GridItem](repeating: GridItem(.flexible()), count: 3)
        
        ScrollView {
            LazyVGrid(columns: columns) {
                ForEach(0..<100) { i in
                    Rectangle()
                        .foregroundColor(i%2 == 0 ? .green : .blue)
                        .aspectRatio(1, contentMode: .fit)
                }
            }
        }
    }
}
