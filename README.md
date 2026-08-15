# Linux For QA Automation Engineer

> Репозиторий-портфолио, демонстрирующий навыки работы с Linux в контексте автоматизации тестирования.

## 🎯 Цель
Показать практические навыки: работа в командной строке, управление процессами, контейнеризация, автоматизация сборки и тестирования Java-приложений.

## 🛠️ Стек технологий
- **ОС:** Linux (Ubuntu/WSL)
- **Shell:** Bash
- **Язык:** Java 17
- **Сборка:** Maven
- **Контейнеризация:** Docker
- **Тестирование:** JUnit 5, HttpURLConnection

## 📂 Структура репозитория
- `scripts/` — готовые bash-скрипты для автоматизации
- `docker/` — Dockerfile для сборки образов
- `src/` — примеры Java-классов
- `test/` — автотесты
- `demo-project/` — полноценный Spring Boot проект
- `docs/` — документация и разбор проблем

## 🚀 Быстрый старт

```bash
# Клонировать репозиторий
git clone https://github.com/dimamoryk/LinuxForQA.git
cd LinuxForQA

# Запустить простой Java-класс
./scripts/run.sh

# Собрать и запустить Spring Boot в Docker
cd demo-project
mvn clean package
docker build -t spring-app -f ../docker/Dockerfile.spring .
docker run -d --name spring-app-container -p 8080:8080 spring-app
curl http://localhost:8080/hello

📚 Чему я научился
Работать с файловой системой и правами доступа

Писать bash-скрипты для автоматизации

Управлять процессами (nohup, ps, kill)

Контейнеризировать Java-приложения

Писать и запускать автотесты в Linux-окружении

Диагностировать и решать проблемы (WSL, сеть, порты)

🧠 Проблемы и решения
Самые интересные кейсы вынесены в docs/troubleshooting.md:

RestAssured vs HttpURLConnection в WSL

Настройка портов и проброс в Docker

Компиляция Java из командной строки

🔗 Связанные проекты
- [JavaForQA](https://github.com/dimamoryk/JavaForQA) — фреймворк для автотестов (приватный репозиторий, доступ по запросу)

```markdown
## 🐳 Запуск с docker-compose
```bash
docker-compose -f docker/docker-compose.yaml up -d
curl http://localhost:8080/hello
docker-compose -f docker/docker-compose.yaml down
```

## 🤖 CI/CD (GitHub Actions)
При каждом push в `main` автоматически запускаются сборка и тесты. Смотри вкладку Actions на GitHub.

## ⚙️ Автоматическая настройка окружения (Ansible)
```bash
ansible-playbook -i localhost, -c local ansible/setup.yaml
```
Устанавливает Java, Maven, Docker, docker-compose, Git, curl.
