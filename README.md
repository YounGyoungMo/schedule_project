# schedule_project
## 일정 관리 API 명세서

### 1. 일정 생성(일정 작성하기)
- **URL**: `/api/schedules`
- **Method**: `POST`
- POST 요청을 통해 새로운 일정을 생성합니다.

### 2. 전체 일정 조회(등록된 일정 불러오기)
- **URL**: `/api/schedules`
- **Method**: `GET`
- **Query Parameters**: `/api/schedules?updatedAt="2025-12-28 00:00:00"&author="작성자명"`
- 수정일과 작성자명을 조건으로 등록된 모든 일정 목록을 조회합니다. 수정일과 작성자명은 선택적으로 가능합니다. 수정일 기준으로 내림차순으로 정렬하여 조회합니다.

### 3. 선택 일정 조회(선택한 일정 정보 불러오기)
- **URL**: `/api/schedules/{id}`
- **Method**: `GET`
- **id**: 조회할 일정의 고유 식별자
- 선택한 일정을 조회합니다.

- ### **Request Body**:
```json
{
  "id": "조회 일정 식별자(long)"
  "task": "할일(string)",
  "author": "작성자명(string)",
  "password": "비밀번호(long)",
  "createdAt": "작성일시(string)",
  "updatedAt": "수정일시(string)"
}
```
