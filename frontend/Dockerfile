# Stage 1: Build the React application
FROM node:18 AS build

# Set working directory
WORKDIR /app

# Copy package.json and package-lock.json
COPY package.json package-lock.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Build the application
RUN npm run build

# Stage 2: Serve the built application using a lightweight web server
FROM nginx:alpine

# Copy the built application from the previous stage
COPY --from=build /app/dist/. /usr/share/nginx/html/.

# Expose port 80
EXPOSE 80

# Start Nginx server
CMD ["nginx", "-g", "daemon off;"]