import java.awt.*;
import java.applet.*;
class ClassForm extends Frame
{
	TextField Frn, Name, Email, Mob, Dob, Qua;
	TextArea Add;
	ClassForm()
	{
		Label fr = new Label("Form No.");
		fr.setBounds(20,50,90,20);
		Frn = new TextField();
		Frn.setBounds(120,50,170,20); 	
		Label nm = new Label("Full Name");
		nm.setBounds(20,80,90,20);
		Name = new TextField();
		Name.setBounds(120,80,170,20);
		Label em = new Label("Email-id");
		em.setBounds(20,110,90,20);
		Email = new TextField();
		Email.setBounds(120,110,170,20);
		Label m = new Label("Mob No.");
		m.setBounds(20,140,90,20);
		Mob = new TextField();
		Mob.setBounds(120,140,170,20);
		Label a = new Label("Address");
		a.setBounds(20,170,100,20);
		Add = new TextArea();
		Add.setBounds(120,170,90,80);
		Label d = new Label("DoB");
		d.setBounds(20,260,100,20);
		Label g = new Label("Gender");
		g.setBounds(20,290,100,20);
		Label q = new Label("Qualification");
		q.setBounds(20,320,100,20);
		Label c = new Label("City");
		c.setBounds(20,350,100,20);
		Label C = new Label("Course");
		C.setBounds(20,380,100,20);
		Label F = new Label("Course Fees");
		F.setBounds(20,410,100,20);
		Label N = new Label("Notes Fees");
		N.setBounds(20,440,100,20);
		Label t = new Label("Total Fees");
		t.setBounds(20,470,100,20);
		Label p = new Label("Pay Method");
		p.setBounds(20,500,100,20);
		Label P = new Label("Installment");
		P.setBounds(20,530,100,20);
		add(fr);
		add(nm);
		add(em);	
		add(m);
		add(a);
		add(d);	
		add(g);
		add(q);
		add(c);
		add(C);
		add(F);
		add(N);
		add(t);
		add(p);
		add(P);
		setSize(700,700);
		setVisible(true);
		setLayout(null);
		setTitle("Form");
	} 
	public static void main(String[] args)
	{
		new ClassForm();
	} 
}