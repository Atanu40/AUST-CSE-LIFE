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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string u = user.Text;
            string p = pass.Text;
            if(u == "Atanu" && p== "170204003")
            {
                
                Form2 f = new Form2(u,p);
                f.Show();
                this.Visible = false;

            }
            else
            {
               
                DialogResult res = MessageBox.Show("Username or password don't match", "Error!", MessageBoxButtons.RetryCancel, MessageBoxIcon.Error);
                if (res == DialogResult.Retry)
                {
                    user.ResetText();
                    pass.ResetText();
                }
            }
            

        }

        private void user_TextChanged(object sender, EventArgs e)
        {

        }

        private void pass_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}
