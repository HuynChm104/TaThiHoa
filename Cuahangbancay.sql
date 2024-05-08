Create database CuaHang__Bancay;
Create table Employees
(   EmpID varchar(10) not null,
    EmpName varchar(30) not null,
	EmpPhoneNumber varchar(10),
	EmpAddress varchar(50),
	EmpRole varchar(15) not null,
	Salary varchar(10),
	Constraint NV_PK primary key (EmpID)
)

Create table Customers
(   CusID varchar(10) primary key not null,
    CusName varchar(30) not null,
	CusPhoneNumber varchar(10),
	CusAddress varchar(50)
)

Create table Products
(   ProductID varchar(10) primary key not null,
    ProductName varchar(30) not null,
	Quantity int,
	Price float,
	ProductType varchar(10), 
	SupplierID varchar(5) not null,
)

Create table Supplier
(   SupplierID varchar(5) primary key not null,
    SupplierName varchar(30) not null,
	SAddress varchar(40),
	SPhoneNumber varchar(10)
)

Create table Sales_Invoice 
(   SaleID varchar(20) primary key not null,
    EmpID varchar(10) not null,
	CusID varchar(10) not null,
	DateSale date,
	TotalAmount float
)

Create table Sales_Invoice_details 
(   SaleID varchar(20) not null,
    ProductID varchar(10) not null,
	Price float,
	Quantity int,
	Constraint SID_PK primary key (SaleID, ProductID)
)
/*
Create table Purchase_Invoice 
(   PIID varchar(20) primary key not null,
    SupplierID varchar(5) not null,
	DatePI date,
	TotalAmount float
)

Create table Purchase_Invoice_details 
(   PIID varchar(20) not null,
    ProductID varchar(10) not null,
	Price float,
	Quantity int,
	Constraint PID_PK primary key (PIID, ProductID)
) */


Alter table Products
Add constraint S_P_FK Foreign key (SupplierID) references Supplier;

---Alter table Products
---Add constraint E_P_FK Foreign key (EmpID) references Employees;

Alter table Sales_Invoice
Add constraint C_SI_FK Foreign key (CusID) references Customers;

Alter table Sales_Invoice
Add constraint E_SI_FK Foreign key (EmpID) references Employees;

Alter table Sales_Invoice_details
Add constraint SI_SID_FK Foreign key (SaleID) references Sales_Invoice;

Alter table Sales_Invoice_details
Add constraint P_SID_FK Foreign key (ProductID) references Products;


---Alter table Purchase_Invoice
---Add constraint S_PI_FK Foreign key (SupplierID) references Supplier;

---Alter table Purchase_Invoice_details
---Add constraint PI_PID_FK Foreign key (PIID) references Purchase_Invoice;

---Alter table Purchase_Invoice_details
---Add constraint P_PID_FK Foreign key (ProductID) references Products;



Insert into Customers values ('A1','Phac Thai Anh','0334354990','Ha Noi');
Insert into Customers values ('A2','Truong Nguyen Anh','0337128954','Bac Ninh');
Insert into Customers values ('A3','Kim Man Khue','0352337971','Yen Bai');

Insert into Employees values ('AA01', 'Ta Thi Hoa', '0385968589', 'Ha Noi', 'Quan ly', '7000');
Insert into Employees values ('AA02', 'Tran Thi Huyen Cham', '0385968589', 'Yen Bai', 'Nhan vien', '3500');
Insert into Employees values ('AA03', 'Ngo Thi Thu Ha', '0356987731', 'Bac Ninh', 'Nhan vien', '3500');

Insert into Supplier values ('0001', 'Super Xanh Store', 'Ha Noi', '0822456987');
Insert into Supplier values ('0002', 'Totoro Garden', 'Ha Noi', '0978888331');
Insert into Supplier values ('0003', 'De Plante', 'Ha Noi', '0322567991');

Insert into Products values ('C001', 'Kim tien',37, 76,'Cay','0001');
Insert into Products values ('C002', 'Xuong rong',10, 50,'Cay','0003');
Insert into Products values ('C003', 'Luoi ho',13, 67,'Cay','0001');
Insert into Products values ('H001', 'Da Yen Thao',20, 45,'Hoa','0002');
Insert into Products values ('H002', 'Mau don',5, 120,'Hoa','0002');

Insert into Sales_Invoice values ('A1234', 'AA03','A3','07/03/2024',45);
Insert into Sales_Invoice values ('A1235', 'AA03','A1','03/07/2024',120);
Insert into Sales_Invoice values ('A1236', 'AA02','A2','10/04/2024',76);

Insert into Sales_Invoice_details values ('A1234','H001',45,1);
Insert into Sales_Invoice_details values ('A1235','H002',120,1);
Insert into Sales_Invoice_details values ('A1236','C001',76,1);


Select * From Customers
Select * From Employees
Select * From Supplier
Select * From Products
Select * From Sales_Invoice
Select * From Sales_Invoice_details
