# 메인 브랜치에서 새로운 기능 브랜치 생성
git checkout main
git pull origin main
git checkout -b feature/user-authentication

# 작업 완료 후 커밋
git add .
git commit -m "Implement user authentication feature"

# 원격 저장소에 브랜치 푸시
git push origin feature/user-authentication

# 개발 브랜치로 이동
git checkout develop
git pull origin develop

# 기능 브랜치 병합
git merge feature/user-authentication

# 충돌 해결 후 병합 완료
git push origin develop


팀 협업을 위한 GitHub 설정
GitHub Organization 생성

팀의 모든 프로젝트를 관리할 수 있는 조직(Organization)을 생성합니다.
레포지토리 생성

프론트엔드와 백엔드를 위한 별도의 레포지토리를 생성합니다.
팀원 초대

조직에 팀원을 초대하고, 각 팀원이 레포지토리에 접근할 수 있도록 권한을 부여합니다.
브랜치 보호 규칙 설정

중요한 브랜치(예: main, develop)에 대한 보호 규칙을 설정하여 직접 푸시를 금지하고, Pull Request(PR) 리뷰를 요구합니다.
Git 브랜치 사용 예시
Organization 및 레포지토리 설정

GitHub에서 Organization 생성
frontend 및 backend 레포지토리 생성
브랜치 생성 및 작업

bash
코드 복사
# 프론트엔드 레포지토리 클론
git clone https://github.com/Online-Investment-Platform/Back_End

cd Back-end

# 메인 브랜치에서 개발 브랜치 생성
git checkout -b develop
git push origin develop

# 기능 브랜치 생성
git checkout -b feature/login-page
작업 완료 후 PR 생성

GitHub에서 feature/login-page 브랜치를 develop 브랜치로 병합하기 위한 Pull Request 생성
팀원의 리뷰 및 승인을 받은 후 병합
Git 브랜치 전략 예시
Main 브랜치 보호

main 브랜치는 배포 가능한 코드만 포함
직접 푸시를 금지하고, PR 리뷰 및 승인을 요구
Develop 브랜치 사용

기능 개발 및 버그 수정은 모두 develop 브랜치에 병합
새로운 기능 또는 버그 수정을 위해 별도의 브랜치 생성
기능 브랜치

feature/ 접두사를 사용하여 새로운 기능 개발
작업 완료 후 PR을 통해 develop 브랜치로 병합
릴리즈 브랜치

릴리즈 준비가 완료되면 release/ 접두사를 사용하여 브랜치 생성
최종 테스트 및 버그 수정 후 main 브랜치로 병합
핫픽스 브랜치

긴급 버그 수정을 위해 hotfix/ 접두사를 사용하여 브랜치 생성
버그 수정 후 main과 develop 브랜치로 병합