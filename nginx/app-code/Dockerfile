FROM nginx:1.27.3-alpine-slim
WORKDIR /usr/share/nginx/html
COPY . .
EXPOSE 80
cmd ["nginx", "-g", "daemon off;"]

