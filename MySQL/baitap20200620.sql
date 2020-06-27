##	1.	Viết câu truy vấn trả về Tên nước, tên cảng, mã cảng 
SELECT 
    P.NAME AS 'PORT NAME', P.PORT_ID 'PORT ID', C.NAME 'COUNTRY'
FROM
    PORT P
        LEFT JOIN
    COUNTRY C ON P.COUNTRY = C.ID;
        
SELECT
	P.NAME 'PORT NAME'
    , P.PORT_ID 'PORT ID'
    , (
		SELECT NAME
        FROM COUNTRY
        WHERE 
			COUNTRY.ID = P.COUNTRY
	) 'COUNTRY'
FROM 
	PORT P;
		

##	2.	Viết câu truy vấn trả về thông tin người dùng gồm first name, last name, email, phone, tên nước

    
##	3.	Viết câu truy vấn trả về thông tin của hành trình (voyage) gồm ID hành trình, tên tuyến (route), 
##		tên tàu, ngày bắt đầu, ngày kết thúc


##	4.	Viết câu truy vấn trả về thông tin tất cả shipment của tuyến có tên là 'Prado'



##	5.	Viết câu truy vấn để lấy thông tin của tất cả cách hàng đã có ít nhất 1 đơn hàng

    
##	6.	Viết câu truy vấn trả về thông tin của hành trình gồm ID, ngày bắt đầu, ngày kết thúc, tên tuyến, tên tàu,
##		thông tin các shipment của hành trình gồm ID, cargo content, số lượng teq, tổng giá trị, trình trạng


##	Viết câu truy vấn trả về thông tin khách hàng gồm: Full name, 
##	địa chỉ (gồm tên đường, thành phố, bang), phone, email,  tên quốc gia

## Tìm hiểu tại sao thứ tự lại không đúng theo ý mong muốn