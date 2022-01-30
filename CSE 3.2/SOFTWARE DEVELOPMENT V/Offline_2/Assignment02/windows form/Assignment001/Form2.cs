using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Assignment001
{
    public partial class Form2 : Form
    {
        public Form2( string a, string b)
        {
            InitializeComponent();
            customer.Text = a;
            id.Text = b;
            comboBox1.Items.Add("Rupee");
            comboBox1.Items.Add("US Dollar");
            comboBox1.Items.Add("Canadian Dollar");
            comboBox1.Items.Add("Japanese Yen");
            

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void customer_TextChanged(object sender, EventArgs e)
        {

        }
        private void tpclick(object sender, EventArgs e)
        {
            int price1,price2,price3,price4,price5,quanty1,quanty2,quanty3,quanty4,quanty5,s;
            double z;
           
           

            if (u1.Text.Trim() == "" || u2.Text.Trim() == "" || u3.Text.Trim() == ""
                || u4.Text.Trim() == "" || u5.Text.Trim() == "")
            {
                MessageBox.Show("Unit price cannot empty", "Error!", MessageBoxButtons.RetryCancel, MessageBoxIcon.Error);
                
                return;
                
            }

            if (a1.Text.Trim() == "" || a2.Text.Trim() == "" || a3.Text.Trim() == ""
                || a4.Text.Trim() == "" || a5.Text.Trim() == "")
            {
                MessageBox.Show("Product Amount cannot empty", "Error!", MessageBoxButtons.RetryCancel, MessageBoxIcon.Error);

             
                return;

            }
            price1 = Convert.ToInt32(u1.Text);
            price2 = Convert.ToInt32(u2.Text);
            price3 = Convert.ToInt32(u3.Text);
            price4 = Convert.ToInt32(u4.Text);
            price5 = Convert.ToInt32(u5.Text);
            quanty1 = Convert.ToInt32(a1.Text);
            quanty2 = Convert.ToInt32(a2.Text);
            quanty3 = Convert.ToInt32(a3.Text);
            quanty4 = Convert.ToInt32(a4.Text);
            quanty5 = Convert.ToInt32(a5.Text);
            if(price1>=1 && price1 <= 100 && price2 >= 1 && price2 <= 100 && price3 >= 1 && price3 <= 100
                && price4 >= 1 && price4 <= 100 && price5 >= 1 && price5 <= 100 && quanty1 >= 1 && quanty1 <= 10 && quanty2 >= 1 && quanty2 <= 10
                 && quanty3 >= 1 && quanty3 <= 10 && quanty4 >= 1 && quanty4 <= 10 && quanty5 >= 1 && quanty5 <= 10)
            {
                s = price1 * quanty1 + price2 * quanty2 + price3 * quanty3 + price4 * quanty4 + price5 * quanty5;
                if (comboBox1.Text == "Rupee")
                {
                    z = Convert.ToDouble(s * 0.86);
                    
                    tpt.Text = Convert.ToString(z);
                }

               if (comboBox1.Text == "US Dollar")
                {
                    z=Convert.ToDouble( s * 0.012);
                   
                    tpt.Text = Convert.ToString(z);
                }
                if (comboBox1.Text == "Canadian Dollar")
                {
                    z = Convert.ToDouble(s * 0.015);
                  
                    tpt.Text = Convert.ToString(z);
                }
                if (comboBox1.Text == "Japanese Yen")
                {
                    z = Convert.ToDouble(s * 1.22);
                    
                    tpt.Text = Convert.ToString(z);
                }

                if (comboBox1.Text == "")
                {
                    z = Convert.ToDouble(s * 1);

                    tpt.Text = Convert.ToString(z);
                }
            }
            else
            {
                MessageBox.Show("Invalid Input ", "info", MessageBoxButtons.OK);
            }

           
           


        }

        private void u1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if(!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void a1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void u2_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void a2_TextChanged(object sender, EventArgs e)
        {

        }

        private void a2_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void u3_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void a3_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void u4_TextChanged(object sender, EventArgs e)
        {

        }

        private void u4_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void a4_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void u5_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void a5_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar))
            {
                e.Handled = true;
                DialogResult da = MessageBox.Show("Enter only Digit ", "error", MessageBoxButtons.OK);
            }
        }

        private void id_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void tpt_TextChanged(object sender, EventArgs e)
        {

        }

        private void u5_TextChanged(object sender, EventArgs e)
        {

        }

        private void label18_Click(object sender, EventArgs e)
        {

        }

        private void label19_Click(object sender, EventArgs e)
        {

        }

        private void Form2_Load(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
