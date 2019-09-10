//
//  ViewController.swift
//  LAB1
//
//  Created by Carlie Charp on 9/8/19.
//  Copyright © 2019 Carlie Charp. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var comment: UILabel!
    
    
    
    @IBOutlet weak var artImage: UIImageView!
    
    @IBAction func artImage(_ sender: UIButton) {
        if sender.tag == 1{
            artImage.image = UIImage(named: "four")
            comment.text = "YAY"
            
    }
        else if sender.tag == 2{
            artImage.image = UIImage(named: "one")
            comment.text = "BOOO"
        }
    }
    
    
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

