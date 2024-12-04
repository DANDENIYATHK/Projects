using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
namespace HNDITFT2020
{
 public partial class Form1 : Form
 {
 public Form1()
 {
 InitializeComponent();
 }
 private void btnCalculate_Click(object sender, EventArgs e)
 {
 double bmi;
 bmi = Convert.ToDouble(txtWeight.Text) / (Convert.ToDouble(txtHeight.Text) * 
Convert.ToDouble(txtHeight.Text));
 txtBMI.Text = bmi.ToString();
 if (bmi < 18.5)
 {
 txtStatus.Text = "Under Weight";
 txtIndicator.BackColor = Color.Red;
 }
 else if (bmi<25)
 {
 txtStatus.Text = "Normal";
 txtIndicator.BackColor = Color.Blue;
 }
 else if (bmi < 30)
 {
 txtStatus.Text = "Over Weight";
 txtIndicator.BackColor = Color.Green;
 }
 else if (bmi < 35)
{
 txtStatus.Text = "Obesity Class I";
 txtIndicator.BackColor = Color.Orange;
 }
 else if (bmi < 40)
 {
 txtStatus.Text = "Obesity Class II";
 txtIndicator.BackColor = Color.Pink;
 }
 else
 {
 txtStatus.Text = "Obesity Class III";
 txtIndicator.BackColor = Color.Brown;
 }
 }
 }
}
