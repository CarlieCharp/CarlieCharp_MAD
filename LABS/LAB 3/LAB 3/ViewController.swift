//
//  ViewController.swift
//  LAB 3
//
//  Created by Carlie Charp on 9/21/19.
//  Copyright © 2019 Carlie Charp. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var carlieLabel: UILabel!
    
    @IBAction func ColorSwitch(_ sender: Any) {
        //trying to update color or carlie lable
            if colorSwitch.isOn {
                carlieLabel.textColor=UIColor.black
                
            } else {
                carlieLabel.textColor=UIColor.yellow
                
            }
    }
    
    @IBOutlet weak var titleLabel: UILabel!
    @IBOutlet weak var hapyyImage: UIImageView!
    @IBOutlet weak var imageControl: UISegmentedControl!
    @IBOutlet weak var capitalSwitch: UISwitch!
    @IBOutlet weak var colorSwitch: UISwitch!
    @IBOutlet weak var fontSizeLabel: UILabel!
    
    func updateImage(){
        if imageControl.selectedSegmentIndex == 0 {
            titleLabel.text = "Yay"
            hapyyImage.image=UIImage(named: "happy")
        }
    
    else if imageControl.selectedSegmentIndex == 1 {
    titleLabel.text="Wooohooo"
    hapyyImage.image=UIImage(named: "crazy")
        }
    
    else if imageControl.selectedSegmentIndex == 2 {
    titleLabel.text = "Hmmm"
        hapyyImage.image=UIImage(named: "question")
        }
    }
    
    func updateCaps (){
        if capitalSwitch.isOn {
            
            titleLabel.text=titleLabel.text?.uppercased()
            
        } else {
            titleLabel.text=titleLabel.text?.lowercased()
        }
    }
    @IBAction func changeInfo(_ sender: UISegmentedControl) {
        updateImage()
        updateCaps()
    }
    //trying to update color or carlie lable
    func updateColor(_sender: Any?){
        if colorSwitch.isOn {
            carlieLabel.textColor=UIColor.black
            
        } else {
            carlieLabel.textColor=UIColor.yellow
            
        }
    }
    
    
    
    //something broken in my font changing slider
    @IBAction func changeFontSize(_ sender: UISlider) {
        let fontSize=sender.value
        fontSizeLabel.text=String(format: "%.0f", fontSize)
        let fontSizeCGFloat=CGFloat(fontSize)
        titleLabel.font=UIFont.systemFont(ofSize:fontSizeCGFloat)
        
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

