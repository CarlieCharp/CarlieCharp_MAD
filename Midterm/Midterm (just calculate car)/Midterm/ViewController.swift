//
//  ViewController.swift
//  Midterm
//
//  Created by Carlie Charp on 10/15/19.
//  Copyright © 2019 Carlie Charp. All rights reserved.
//

import UIKit

//I think I have all three things I need to dismiss keyboard but its still not working... I did my best
class ViewController: UIViewController, UITextFieldDelegate {
    
    //All the crazy decimals are just the fraction equivelent because I couldn't figure out division
    @IBOutlet weak var mileAmountTextFeild: UITextField!
    @IBOutlet var transportationChoice: UISegmentedControl!
    @IBOutlet weak var imageView: UIImageView!
    
    @IBOutlet weak var monthSwitch: UISwitch!
    @IBOutlet weak var updateGas: UIStepper!
    
    
    @IBOutlet weak var gasTankLabel: UILabel!
    @IBOutlet weak var commuteTimeLabel: UILabel!
    @IBOutlet weak var gasLabel: UILabel!
    
    
    
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    
    
    @IBAction func updateGas(_ sender: Any) {
        if updateGas.value == 1 {
            gasTankLabel.text = "1 gallon"
        } else {
            gasTankLabel.text = String(format: "%.0f", updateGas.value) + " gallons"
        }
    }
    
    
    
    
    
    //I was trying to make it so the calculations would be individulized to each segmented control but obviously when you hit commute it only does the car calculations.
    @IBAction func calculateCommute(_ sender: Any) {
        if transportationChoice.selectedSegmentIndex == 0 {
        let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
        let commuteTime = (mileAmount * 0.33333333)
        self.commuteTimeLabel.text = "\(commuteTime)"
        let gas = (mileAmount * 0.04166667)
        self.gasLabel.text = "\(gas)"
        }
        
        else if transportationChoice.selectedSegmentIndex == 1 {
            let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
            //0.2 = (12 miles/60 minutes)
            let commuteTime = (mileAmount * 0.2)
            self.commuteTimeLabel.text = "\(commuteTime)"
            self.gasLabel.text = "Zero"
        }
        else if transportationChoice.selectedSegmentIndex == 2 {
            let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
            //0.16666667 = (10 miles/60 minutes)
            let commuteTime = (mileAmount * 0.16666667)
            self.commuteTimeLabel.text = "\(commuteTime)"
            
            self.gasLabel.text = "Zero"
      
    }
    
    
    //The switch updates it but you have to switch it on and off to see it
    @IBAction func monthUpdate(_ sender: Any) {
        if transportationChoice.selectedSegmentIndex == 0 {
            let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
             //0.3333333 = (20 miles/60 minutes)
            let commuteTime = (mileAmount * 0.33333333 * 20)
            self.commuteTimeLabel.text = "\(commuteTime)"
            let gas = (mileAmount * 0.04166667 * 20)
            self.gasLabel.text = "\(gas)"
        }
        
        if transportationChoice.selectedSegmentIndex == 1 {
            let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
            //0.2 = (12 miles/60 minutes)
            let commuteTime = (mileAmount * 0.2 * 20)
            self.commuteTimeLabel.text = "\(commuteTime)"
            self.gasLabel.text = "Zero"
        }
        
        if transportationChoice.selectedSegmentIndex == 2 {
            let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
             //0.16666667 = (10 miles/60 minutes)
            let commuteTime = (mileAmount * 0.16666667 * 20)
            self.commuteTimeLabel.text = "\(commuteTime)"
        
            self.gasLabel.text = "Zero"
        }
    }
    
    
    
    
    
    
    
    
    @IBAction func transpertationChoice(_ sender: UISegmentedControl) {
         if transportationChoice.selectedSegmentIndex == 0 {
            imageView.image=UIImage(named: "car")
        }
        
        if transportationChoice.selectedSegmentIndex == 1 {
            imageView.image=UIImage(named: "bus")
           
        }
        if transportationChoice.selectedSegmentIndex == 2 {
            imageView.image=UIImage(named: "bike")
            gasLabel.text = "zero"
            createAlert(title: "GO GREEN", message: "Thanks for choosing to ride a bike today! You are saving the planet.")
           
    
        }
    }
    
    func createAlert (title: String, message: String)
    {
        let alert = UIAlertController(title: title, message: message, preferredStyle: UIAlertController.Style.alert)
        
        alert.addAction(UIAlertAction(title: "OK", style: UIAlertAction.Style.default, handler: { (action) in alert.dismiss(animated: true, completion:nil)
        }))
        
        self.present(alert, animated: true, completion: nil)
    }
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        self.textField.delegate = self
        // Do any additional setup after loading the view.
    }

   

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
}
    override func touchBegan( touches: Set<UITouch>, with event: UIEvent?) {
        self.view.endEditing(true)
    }
    
    func textFieldShouldReturn( textField: UITextField) -> bool {textField.resignFirstResponder()
        return (true)
    }
}
