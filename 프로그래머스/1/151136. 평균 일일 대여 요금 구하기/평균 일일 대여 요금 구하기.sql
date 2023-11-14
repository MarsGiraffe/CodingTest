-- 코드를 입력하세요
select round(sum(c.daily_fee)/d.car_type) average_fee from 
(SELECT * from CAR_RENTAL_COMPANY_CAR
where car_type = 'suv') c,
(SELECT count(*) car_type from CAR_RENTAL_COMPANY_CAR
where car_type = 'suv') d;