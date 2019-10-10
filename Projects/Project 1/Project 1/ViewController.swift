//
//  ViewController.swift
//  Project 1
//
//  Created by Carlie Charp on 10/2/19.
//  Copyright © 2019 Carlie Charp. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var sizeControl: UISegmentedControl!
    @IBOutlet weak var leftImage: UIImageView!
    @IBOutlet weak var rightImage: UIImageView!
    
    @IBOutlet weak var label: UILabel!
    
    @IBOutlet weak var updateLabel: UILabel!
    
    @IBOutlet weak var updateWater: UIStepper!
    
    @IBOutlet weak var Hydrolabel: UILabel!
    
    

    func resetView(){
        
        sizeControl.selectedSegmentIndex = -1
        updateWater.isHidden = true //Aileen taught me isHidden
        updateLabel.isHidden = true
        leftImage.isHidden = true
        rightImage.isHidden = true
        label.text="64oz, you got this!"
        updateWater.value=0;
        
        
    }
    
    

    
    
    
    
    @IBAction func changeBottle(_ sender: AnyObject) {
        if sizeControl.selectedSegmentIndex == 0 {
            leftImage.isHidden = false
            rightImage.isHidden = false
            leftImage.image=UIImage(named: "2 grey")
            rightImage.image=UIImage(named: "2 grey")
            label.text="It's only 4 bottles!"
            updateWater.isHidden = false
            updateLabel.isHidden = false
            updateLabel.text = "zero oz"
             updateWater.value=0; // how to reset stepper https://stackoverflow.com/questions/10163575/resetting-uistepper
            
            
            
            
        }
        if sizeControl.selectedSegmentIndex == 1 {
            leftImage.isHidden = false
            rightImage.isHidden = false
            leftImage.image=UIImage(named: "1 grey")
            rightImage.image=UIImage(named: "1 grey")
            label.text="It's only 2 bottles!"
            updateLabel.isHidden = false
            updateWater.isHidden = false
            updateLabel.text = "zero oz"
             updateWater.value=0;
            
            
        }
        
    }
    

    
 

  
    
    
    @IBAction func updateWater(_ sender: UIStepper) {
        if sizeControl.selectedSegmentIndex == 0 {
            if sender.value == Double(16){
            updateLabel.text = "16 oz"
             rightImage.image=UIImage(named: "1 of 2 blue")
            }
            else if sender.value == Double(32){
            updateLabel.text = "32 oz"
            rightImage.image=UIImage(named: "2 blue")
            leftImage.image=UIImage(named: "2 grey")
            }
            else if sender.value == Double(48) {
            updateLabel.text = "48 oz"
            leftImage.image=UIImage(named: "1 of 2 blue")
            label.text="It's only 4 bottles!"
            }
            else if sender.value == Double(64) {
            updateLabel.text = "64 oz"
            leftImage.image=UIImage(named: "2 blue")
            label.text="Great Job, You Did It!"
            }
            
            else if sender.value == Double(0) {
                updateLabel.text = "zero oz"
                leftImage.image=UIImage(named: "2 grey")
                rightImage.image=UIImage(named: "2 grey")
            }
        }
        if sizeControl.selectedSegmentIndex == 1 {
            if sender.value == Double(16){
            updateLabel.text = "16 oz"
                rightImage.image=UIImage(named: "1:2 blue")
                leftImage.image=UIImage(named: "1 grey")
            }
            else if sender.value == Double(32){
            updateLabel.text = "32 oz"
                rightImage.image=UIImage(named: "1 blue")
                leftImage.image=UIImage(named: "1 grey")
            }
            else if sender.value == Double(48){
                updateLabel.text = "48 oz"
                leftImage.image=UIImage(named: "1:2 blue")
                label.text="It's only 2 bottles!"
            }
            else if sender.value == Double(64){
                updateLabel.text = "64 oz"
                leftImage.image=UIImage(named: "1 blue")
                label.text="Great Job, You Did It!"
            }
            
            else if sender.value == Double(0) {
                updateLabel.text = "zero oz"
                leftImage.image=UIImage(named: "1 grey")
                rightImage.image=UIImage(named: "1 grey")
            }
        }
    }
    
    
    
    
    
    
    @IBAction func reset(_ sender: UIButton) {
        resetView()
    }
    
    
  
        
    
    
    override func viewDidLoad() {
        resetView()
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

