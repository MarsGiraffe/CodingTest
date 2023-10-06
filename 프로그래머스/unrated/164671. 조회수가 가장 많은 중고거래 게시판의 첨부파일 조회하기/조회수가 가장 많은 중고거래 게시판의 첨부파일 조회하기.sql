-- 코드를 입력하세요
SELECT 
    ('/home/grep/src/'||f.board_id||'/'||file_id||file_name||file_ext) AS file_path
from used_goods_file f, USED_GOODS_BOARD b
where f.board_id = b.board_id
and VIEWS = (select MAX(VIEWS) from USED_GOODS_BOARD)
order by file_id desc;

