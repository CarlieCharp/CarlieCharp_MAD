//
//  ViewController.swift
//  Midterm
//
//  Created by Carlie Charp on 10/15/19.
//  Copyright © 2019 Carlie Charp. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {

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
    
    
    
    
    
    
    @IBAction func calculateCommute(_ sender: Any) {
        let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
        let commuteTime = (mileAmount * 0.33333333)
        self.commuteTimeLabel.text = "\(commuteTime)" + " hrs"
        let gas = (mileAmount * 0.04166667)
        self.gasLabel.text = "\(gas)" + " gallons"
    }
    
    
    
    @IBAction func monthUpdate(_ sender: Any) {
        if transportationChoice.selectedSegmentIndex == 0 {
            let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
             //0.3333333 = (20 miles/60 minutes)
            let commuteTime = (mileAmount * 0.33333333 * 20)
            self.commuteTimeLabel.text = "\(commuteTime)" + " hrs"
            let gas = (mileAmount * 0.04166667 * 20)
            self.gasLabel.text = "\(gas)" + " gallons"
        }
        
        if transportationChoice.selectedSegmentIndex == 1 {
            let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
            //0.2 = (12 miles/60 minutes)
            let commuteTime = (mileAmount * 0.2 * 20)
            self.commuteTimeLabel.text = "\(commuteTime)" + " hrs"
            self.gasLabel.text = "Zero gallons"
        }
        
        if transportationChoice.selectedSegmentIndex == 2 {
            let mileAmount = Double(self.mileAmountTextFeild.text ?? "") ?? 20
             //0.16666667 = (10 miles/60 minutes)
            let commuteTime = (mileAmount * 0.16666667 * 20)
            self.commuteTimeLabel.text = "\(commuteTime)" + " hrs"
        
            self.gasLabel.text = "Zero gallons"
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
        // Do any additional setup after loading the view.
    }


}

