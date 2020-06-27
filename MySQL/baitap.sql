##	1.	Viết câu truy vấn trả về Tên nước, tên cảng, mã cảng 
SELECT C.NAME 'Country Name', P.NAME 'Port Name', P.CODE 'Port Code'
FROM COUNTRY C
	JOIN PORT P ON C.ID = P.COUNTRY;

##	2.	Viết câu truy vấn trả về thông tin người dùng gồm first name, last name, email, phone, tên nước
SELECT FIRST_NAME, LAST_NAME, EMAIL, PHONE, C.NAME as Country
FROM USER U
	LEFT JOIN COUNTRY C ON U.COUNTRY = C.ID
ORDER BY Country DESC;
    
##	3.	Viết câu truy vấn trả về thông tin của hành trình (voyage) gồm ID hành trình, tên tuyến (route), 
##		tên tàu, ngày bắt đầu, ngày kết thúc
SELECT V.VOYAGE_ID, R.NAME 'Route Name', S.NAME 'Ship Name', START_DATE, END_DATE
FROM VOYAGE V
	LEFT JOIN ROUTE R ON V.ROUTE_ID = R.ROUTE_ID
    LEFT JOIN SHIP S ON V.SHIP_ID = S.SHIP_ID;

##	4.	Viết câu truy vấn trả về thông tin tất cả shipment của tuyến có tên là 'Prado'
SELECT S.SHIPMENT_ID, S.CARGO_CONTENT, S.TEQ_QUANTITY, S.TOTAL_COST, V.VOYAGE_ID 'Voyage Id', R.NAME 'Route Name', R.ROUTE_ID 'Route Id'
FROM SHIPMENT S
	INNER JOIN VOYAGE_SHIPMENT VS ON S.SHIPMENT_ID = VS.SHIPMENT_ID
    INNER JOIN VOYAGE V ON VS.VOYAGE_ID = V.VOYAGE_ID
    INNER JOIN ROUTE R ON V.ROUTE_ID = R.ROUTE_ID
WHERE R.NAME LIKE 'Prado';


##	5.	Viết câu truy vấn để lấy thông tin của tất cả cách hàng đã có ít nhất 1 đơn hàng
SELECT FIRST_NAME, LAST_NAME, PHONE, EMAIL
FROM USER U
WHERE EXISTS ( ## early return
	SELECT USER_ID
    FROM USER_SHIPMENT US
    WHERE U.USER_ID = US.USER_ID
)

SELECT * FROM USER_SHIPMENT;
    

##	6.	Viết câu truy vấn trả về thông tin của hành trình gồm ID, ngày bắt đầu, ngày kết thúc, tên tuyến, tên tàu,
##		thông tin các shipment của hành trình gồm ID, cargo content, số lượng teq, tổng giá trị, trình trạng


##	Viết câu truy vấn trả về thông tin khách hàng gồm: Full name, 
##	địa chỉ (gồm tên đường, thành phố, bang), phone, email,  tên quốc gia
SELECT 	ROW_NUMBER() OVER (ORDER BY LAST_NAME) 'No.',
		CONCAT(FIRST_NAME,' ',LAST_NAME) 'Full Name',
		CONCAT(ADDRESS,', ',CITY,', ',STATE) 'Address',
        PHONE,
        EMAIL,
        C.NAME 'Country'
FROM USER U
	LEFT JOIN COUNTRY C ON  U.COUNTRY = C.ID;
##############
SET @row_number:= 0;
SELECT 	(@row_number:=@row_number + 1) 'No.',
		CONCAT(FIRST_NAME,' ',LAST_NAME) as FullName,
		CONCAT(ADDRESS,', ',CITY,', ',STATE) 'Address',
        PHONE,
        EMAIL,
        C.NAME 'Country'
FROM USER U
	LEFT JOIN COUNTRY C ON  U.COUNTRY = C.ID
ORDER BY C.NAME; 
## Tìm hiểu tại sao thứ tự lại không đúng theo ý mong muốn